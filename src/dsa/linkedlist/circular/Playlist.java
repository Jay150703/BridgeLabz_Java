package dsa.linkedlist.circular;

/*
 * Playlist Management using Circular Linked List
 * -----------------------------------------------
 * This program demonstrates a Circular Singly Linked List
 * to manage a music playlist.
 *
 * Each node represents a song with:
 * - Song Name
 * - Artist
 * - Duration
 *
 * The last node points back to the head, enabling
 * continuous (cyclic) playback.
 */

public class Playlist {

    /* ---------- Node Definition ---------- */
    static class SongNode {
        String songName;
        String artist;
        double duration; // in minutes
        SongNode next;

        // Constructor
        SongNode(String songName, String artist, double duration) {
            this.songName = songName;
            this.artist = artist;
            this.duration = duration;
            this.next = this; // Circular reference
        }
    }

    // Head of the circular linked list
    private SongNode head;

    /* ---------- Add Operations ---------- */

    // Add song at the end of playlist
    public void addSong(String name, String artist, double duration) {
        SongNode newNode = new SongNode(name, artist, duration);

        // If playlist is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        SongNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        // Insert new node at the end
        temp.next = newNode;
        newNode.next = head;
    }

    /* ---------- Delete Operation ---------- */

    // Delete song by name
    public void deleteSong(String name) {

        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        // If only one node
        if (head.next == head && head.songName.equals(name)) {
            head = null;
            System.out.println("Song deleted");
            return;
        }

        // If head node needs to be deleted
        if (head.songName.equals(name)) {
            SongNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            System.out.println("Song deleted");
            return;
        }

        // Traverse to find song
        SongNode current = head;
        while (current.next != head && !current.next.songName.equals(name)) {
            current = current.next;
        }

        if (current.next == head) {
            System.out.println("Song not found");
        } else {
            current.next = current.next.next;
            System.out.println("Song deleted");
        }
    }

    /* ---------- Display Operation ---------- */

    // Display playlist
    public void displayPlaylist() {

        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        SongNode temp = head;
        do {
            System.out.println(
                    "Song: " + temp.songName +
                            ", Artist: " + temp.artist +
                            ", Duration: " + temp.duration + " mins"
            );
            temp = temp.next;
        } while (temp != head);
    }

    /* ---------- Main Method ---------- */

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addSong("Believer", "Imagine Dragons", 3.5);
        playlist.addSong("Shape of You", "Ed Sheeran", 4.1);
        playlist.addSong("Naatu Naatu", "RRR", 4.8);

        System.out.println("Playlist:");
        playlist.displayPlaylist();

        System.out.println("\nDeleting song: Shape of You");
        playlist.deleteSong("Shape of You");

        System.out.println("\nUpdated Playlist:");
        playlist.displayPlaylist();
    }
}
