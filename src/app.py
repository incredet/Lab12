from flask import Flask
import time

app = Flask(__name__)
@app.route("/")
def main():
    return 'hello'

if __name__ == '__main__':
    app.run()