import socket

SERVER_ADDRESS = "127.0.0.1"
SERVER_PORT = 12345

client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

while True:
    message = input("Enter a message (or type 'exit' to quit): ")
    if message == "exit":
        break
    client_socket.sendto(message.encode("utf-8"), (SERVER_ADDRESS, SERVER_PORT))

client_socket.close()
