# used to create a json response
from flask import Flask, request, jsonify 

# create a location for the api
app = Flask(__name__)

# creates a route which is an endpoint where we can go to to get our data
@app.route("/get-user/<user_id>")
# defines python function
def get_user(user_id):
    user_data = {
        "user_id": user_id,
        "name": "Shlok Shinde",
        "email": "shindeshlok4@gmail.com"
    }
    # .args stores all of the query parameters
    # .get is used to access the parameter
    extra = request.args.get("extra")
    if extra:
        user_data["extra"] = extra

    return jsonify(user_data), 200
    # data we want the user to have access to
    return "Home"

# query parameters (?) can be used to add an additional variable that you can pass along to your route
# for example get-user/2231?extra=hello world

# Different HTTP methods: 
# GET - Request data from a specified source
# POST - Create a resource
# PUT - Update a resouce
# DELETE - Delete a resource

# runs api and flask server
if __name__ == '__main__':
    app.run(debug=True)