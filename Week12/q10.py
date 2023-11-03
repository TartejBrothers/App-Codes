import socket

SERVER_ADDRESS = '127.0.0.1'
SERVER_PORT = 12345

server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server_socket.bind((SERVER_ADDRESS, SERVER_PORT))

print(f"UDP server is listening on {SERVER_ADDRESS}:{SERVER_PORT}")

while True:
    data, client_address = server_socket.recvfrom(1024)
    print(f"Received from client at {client_address}: {data.decode('utf-8')}")
