import socket

SERVER_ADDRESS = "127.0.0.1"
SERVER_PORT = 54321

server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server_socket.bind((SERVER_ADDRESS, SERVER_PORT))
print(f"Listening on {SERVER_ADDRESS}:{SERVER_PORT}")
while True:
    data, client_address = server_socket.recvfrom(1024)
    decoded_data = data.decode("utf-8")

    if decoded_data == "UDP Message":
        acknowledgment = "Message Received"
        server_socket.sendto(acknowledgment.encode("utf-8"), client_address)
