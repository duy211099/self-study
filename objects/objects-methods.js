let restaurant = {
    name: 'ASB',
    guestCapacity: 75,
    guestCount: 0,
    checkAvailability: function (partySize) {
        let seatsLeft = this.guestCapacity - this.guestCount;
        return partySize <= seatsLeft;
    },
    seatParty: function(number){
        this.guestCount+=number;
    },
    removeParty: function(number){
        this.guestCount-=number;
    }
}
restaurant.seatParty(72);
console.log(restaurant.checkAvailability(4));
restaurant.removeParty(50);
console.log(restaurant.checkAvailability(4));
