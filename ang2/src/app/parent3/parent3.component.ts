import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrls: ['./parent3.component.css']
})
export class Parent3Component implements OnInit {
  selectedlap;

  laps=[
    {
      imgUrl:'https://cdn.pixabay.com/photo/2015/05/29/19/18/bicycle-789648__480.jpg',
      name:'Atlas Cycles',
      about:'This brand was established in 1950. If you are someone born in the 1960’s/70’s, this is a brand that you will remember very well. This company was established by Shri Janki Das Kapur to serve the needs of the common man of India. The need for a cost-effective mode of transportation.'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2015/01/13/13/20/guy-598180_1280.jpg',
      name:'Avon Cycles',
      about:'Like Atlas, Avon is also amongst the oldest cycle brands in India. They started off as a cycle saddle and brake manufacturing company in 1948. Avon cycles started manufacturing bicycles in 1951. This company was set up by Pahwa brothers in Punjab. They believe in offering a good quality product at a very affordable price.'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2014/09/07/21/59/bicycle-438400__480.jpg',
      name:'Cannondale Cycles',
      about:'Cannondale brand is owned by Canadian firm Dorel Industries. They are known globally for their innovative bicycle designs. They produce and sell a wide range of performance bicycles across the globe.'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendlaps(lap)
  {
    console.log(lap);
    this.selectedlap=lap;
  }

}
