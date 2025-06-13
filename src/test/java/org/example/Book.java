package org.example;

public class Book {
        private String title;
        private String author;
        private int pages;

        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPages() {
            return pages;
        }
    @Override
    public String toString() {
        return String.format("Book Title is: %s, Author is: %s, The number of pages: %d", title, author, pages);
    }

    }

