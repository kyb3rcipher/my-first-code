<?php
function connectToDatabase() {
    $conn = new mysqli("localhost", "root", "", "database");

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    return $conn;
}
?>