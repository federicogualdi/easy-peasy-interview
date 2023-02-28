### This is a repo with simple questions that can be asked of high school students during interviews for an intership

# Easy Peasy Interview

Exercises:
1. Given two lists of Oxy points, one for the X axis and the other for Y, calculate Area and Perimeter of the shape.
2. Given a list of two-point lists, calculate the perimeter of the largest triangle you can create

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Verification of exercise correctness

### Exercise 1
```shell script
./mvnw test -Dtest="Ex1ShapeServiceTest"
```

### Exercise 2
```shell script
./mvnw test -Dtest="Ex2TriangleServiceTest"
```