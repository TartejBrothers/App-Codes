import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

SERVER_ADDRESS = "127.0.0.1"
SERVER_PORT = 12345

server_socket.bind((SERVER_ADDRESS, SERVER_PORT))
server_socket.listen(1)
print(f"Listening on {SERVER_ADDRESS}:{SERVER_PORT}")
while True:
    client_socket, client_address = server_socket.accept()

    message = "UDP Message"
    client_socket.send(message.encode())

    response = client_socket.recv(1024).decode()
    print(response)

    client_socket.close()
