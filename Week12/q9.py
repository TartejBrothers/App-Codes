import socket

SERVER_ADDRESS = "127.0.0.1"
SERVER_PORT = 12345

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind((SERVER_ADDRESS, SERVER_PORT))
server_socket.listen(1)
print(f"Listening on {SERVER_ADDRESS}:{SERVER_PORT}")
while True:
    client_socket, client_address = server_socket.accept()
    received_data = b""

    while True:
        data_chunk = client_socket.recv(1024)
        if not data_chunk:
            break
        received_data += data_chunk

    with open("received_file.txt", "wb") as file:
        file.write(received_data)
    print("File received successfully!")
    client_socket.close()
