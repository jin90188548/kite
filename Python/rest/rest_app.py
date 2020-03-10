from flask import Flask, jsonify, abort

app = Flask(__name__)

@app.route('/')
def index():
    return '<h1>Hello~!!</h1>'

@app.route('/rest/v1/data', methods=['GET'])  
def data_get():

    data_dic = [{
        'id':'cool',
        'name':'COOL',
        'pw':'abcd1234'
    },
    {
        'id':'cool',
        'name':'COOL',
        'pw':'abcd1234'
    }
    ]

    return jsonify({'members':data_dic})


@app.route('/rest/v1/leds/<int:led_id>', methods=['GET'])  
def led_get(led_id):

    data_dic = {
        'led_no': led_id
        }

    if led_id > 9:
        abort(500)

    return jsonify(data_dic)


if __name__ == '__main__':
    app.run(debug=True)