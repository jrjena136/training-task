import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {

  Flight:String="Pune-Delhi"
  Timehr:number=1;
  DistKm:number=1500;

  constructor() { }

  ngOnInit(): void {
  }

}
