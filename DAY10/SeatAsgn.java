class SeatAsgn {
  int row;
  String seat;
  
  SeatAsgn (int row, String seat) {
    this.row = row;
    this.seat = seat;
  }
}

class AirlineTicket {
  String fromCity;
  String toCity;
  int flightNum;
  SeatAsgn seat;
  
  AirlineTicket (String fromCity, String toCity, 
                 int flightNum, SeatAsgn seat) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.flightNum = flightNum;
    this.seat = seat;
  }
}
