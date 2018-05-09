# mavenmicro

This is a small test project to have a starting point for creating microservices powered by Docker using a docker-compose and payara/micro as a bottom layer.
The route's naming convention isn't RESTful but that wasn't the purpose of this test!

## Getting Started

In order to use it, you can clone the project

```
git clone https://github.com/alexsaker/mavenmicro
```

and run it

```
$ cd mavenmicro
$ cd pong/ && mvn clean install && cd ../ping/ && mvn clean install && cd ..
$ docker-compose up --build -d
```

and checkout api

```
http://<docker ip>:3001/ping/v1/application.wadl
http://<docker ip>:3001/ping/v1/ping
http://<docker ip>:3002/pong/v1/application.wadl
http://<docker ip>:3002/pong/v1/pong
```

### Prerequisites

Have maven installed
Have Docker and docker-compose installed!

### Running

## Authors

* **Alexandre Saker** - _Initial work_ - [GitHub](https://github.com/alexsaker)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
