This is a game bot that plays the game 1 to 50 found at http://zzzscore.com/1to50/en/ for you.
Using a webdriver I am able to determine which buttons to click using the html source.

I store the elements in a list in the order they are meant to be clicked, sort of a modification
of a bucket sort algorithm, and then I iterate over the list clicking the elements as they come along.

Since all the elements that need to be clicked are not seen on the screen at any given time,
we have to scan the elements multiple times. Hence the time complexity of the algo becomes 
O(n) * the number of refreshes it takes.
