Transport application

```curl --location 'localhost:8080/api/auth/signup' \
--header 'username: admin' \
--header 'password: admin' \
--header 'Content-Type: application/json' \
--header 'Cookie: akhilesh=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzA0NzE5NDQ4LCJleHAiOjE3MDQ3MTk3NDh9.7LA-LWy_MGWEje3vmpMqGBiwxItggIKLDfmybVRqL6w; JSESSIONID=3C1846CD8DF2B87AD4177FEBBA9B0A07' \
--data-raw '{
"username": "admin",
"password": "",
"email": "test@tets.com",
"role": ["ADMIN"]
}'```

```
curl --location 'localhost:8080/api/auth/signup' \
--header 'username: admin' \
--header 'password: admin' \
--header 'Content-Type: application/json' \
--header 'Cookie: akhilesh=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzA0NzE5NDQ4LCJleHAiOjE3MDQ3MTk3NDh9.7LA-LWy_MGWEje3vmpMqGBiwxItggIKLDfmybVRqL6w; JSESSIONID=3C1846CD8DF2B87AD4177FEBBA9B0A07' \
--data-raw '{
"username": "admin",
"password": "",
"email": "test@tets.com",
"role": ["ADMIN"]
}'
```


```
curl --location 'localhost:8080/api/bus/add' \
--header 'username: admin' \
--header 'password: admin' \
--header 'Content-Type: application/json' \
--header 'Cookie: akhilesh=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTcwNDcyMzEzOSwiZXhwIjoxNzA0NzIzNDM5fQ.FtaiDLOgHiNlhgtCzxRPmiuTrRkFaEpxuFaWB3CgZzI; JSESSIONID=3C1846CD8DF2B87AD4177FEBBA9B0A07' \
--data '{
"busNumber": "ABC123",
"busType": "Express",
"startTime": "08:00:00",
"endTime": "18:00:00",
"route": {
"id": 3
}
}
'
```


