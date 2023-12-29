const books = [
  { title: 'The Great Gatsby', author: 'F. Scott Fitzgerald', genre: 'Fiction', pages: 180 },
  { title: 'To Kill a Mockingbird', author: 'Harper Lee', genre: 'Fiction', pages: 281 },
  { title: '1984', author: 'George Orwell', genre: 'Dystopian', pages: 328 },
  { title: 'The Catcher in the Rye', author: 'J.D. Salinger', genre: 'Fiction', pages: 224 },
  { title: 'The Hobbit', author: 'J.R.R. Tolkien', genre: 'Fantasy', pages: 310 },
  { title: 'Pride and Prejudice', author: 'Jane Austen', genre: 'Fantasy', pages: 279 },
];

// 1. Filter books by genre='Fiction'
const fictionBooks = books.filter(book => book.genre === 'Fiction');
console.log('Fiction Books:', fictionBooks);

// 2. Filter books with more than 250 pages
const booksOver250Pages = books.filter(book => book.pages > 250);
console.log('Books with more than 250 pages:', booksOver250Pages);

// 3. Get all book titles
const allBookTitles = books.map(book => book.title);
console.log('All Book Titles:', allBookTitles);

// 4. Increase every book pages by +5
const booksIncreasedPages = books.map(book => ({ ...book, pages: book.pages + 5 }));
console.log('Books with increased pages:', booksIncreasedPages);

// 5. Filter the genre 'Fantasy' and increase pages by +10
const fantasyBooksIncreasedPages = books
  .filter(book => book.genre === 'Fantasy')
  .map(book => ({ ...book, pages: book.pages + 10 }));
console.log('Fantasy Books with increased pages:', fantasyBooksIncreasedPages);

// 6. Reduce the book pages by -50, then filter books with pages > 250
const reducedAndFilteredBooks = books
  .map(book => ({ ...book, pages: book.pages - 50 }))
  .filter(book => book.pages > 250);
console.log('Reduced and Filtered Books:', reducedAndFilteredBooks);

// 7. Calculate total pages of all books
const totalPages = books.reduce((total, book) => total + book.pages, 0);
console.log('Total Pages of All Books:', totalPages);