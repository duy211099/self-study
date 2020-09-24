let isGuestOneVegan = true;
let isGuestTwoVegan = true;

if (isGuestOneVegan && isGuestTwoVegan) {
    console.log('Only offer up vegan dishes');
} else if (isGuestOneVegan || isGuestTwoVegan) {
    console.log('At least one vegan?');
} else {
    console.log('No vegan?');
}