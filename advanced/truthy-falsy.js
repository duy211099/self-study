const products = [];
const product = products[0];

// Truthy - Values that resolve to trye in boolean context
// Falsy - Values that resolve to falsr in booolean context
// Falsy values - false, 0, emty, null, undefined, NaN

if (product !== undefined) {
    console.log('found');
} else {
    console.log('not found');
}