import json

with open('member_data.json', 'r', encoding='utf-8') as file:
    content = file.read()
    #print(content)
    json_data = json.loads(content)
    #print(json_data)
    for member in json_data:
        print(member['uname'])