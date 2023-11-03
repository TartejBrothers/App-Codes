import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(("127.0.0.1", 12345))
server_socket.listen(1)
print("Server is listening for connections...")
while True:
    client_socket, client_address = server_socket.accept()
    data = client_socket.recv(1024)
    if not data:
        break
    client_socket.send(data)
    client_socket.close()
