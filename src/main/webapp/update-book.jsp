<!DOCTYPE html>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book</h2>
    <form action="updateBook" method="post">
        <input type="hidden" name="id" value="${book.id}">
        Title: <input type="text" name="title" value="${book.title}" required><br>
        Author: <input type="text" name="author" value="${book.author}" required><br>
        Price: <input type="text" name="price" value="${book.price}" required><br>
        <input type="submit" value="Update Book">
    </form>
    <a href="listBooks">View Books</a>
</body>
</html>