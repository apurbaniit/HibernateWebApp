<!DOCTYPE html>
<html>
<head>
    <title>List Books</title>
</head>
<body>
    <h2>List of Books</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>
                    <a href="updateBook?id=${book.id}">Edit</a>
                    <a href="deleteBook?id=${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="addBook">Add New Book</a>
</body>
</html>