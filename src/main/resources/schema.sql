CREATE TABLE IF NOT EXISTS PHOTOS (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    FILE_NAME VARCHAR(255),
    CONTENT_TYPE VARCHAR(255),
    DATA BLOB -- Using BLOB data type to store binary data
);
