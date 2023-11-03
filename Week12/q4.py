import socket

SERVER_ADDRESS = "127.0.0.1"
SERVER_PORT = 12345

server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

server_socket.bind((SERVER_ADDRESS, SERVER_PORT))
print(f"Listening on {SERVER_ADDRESS}:{SERVER_PORT}")

while True:
    data, client_address = server_socket.recvfrom(1024)
    client_number = int(data.decode("utf-8"))

    if client_number % 2 == 0:
        result = "Even"
    else:
        result = "Odd"

    server_socket.sendto(result.encode("utf-8"), client_address)
