# tripletFinder
Sample program to find a triplet in an array, where the sum does corresponds to the given value

## Basic algorithm
The method TripletFinder.findTripletInArray presents a basic version,
which iterates over three loops in order to sum up the values in the array

### Time analysis
We have 3 nested loops, so the time needed by this algorithm will rise in power form according to complexity of input parameters
The formulae is: O(N^3)

## Optimized algorithm
The method TripletFinder.findTripletInArrayOptimized presents an optimized version,
where we have 2 loops. It was possible to remove 1 loop by sorting the given array.
Then, we can move along 2 indexes from both ends of the array until they meet.

### Time analysis
We have 2 nested loops, performance is increased.
The formulae is: O(N^2)