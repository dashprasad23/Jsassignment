import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent4',
  templateUrl: './parent4.component.html',
  styleUrls: ['./parent4.component.css']
})
export class Parent4Component implements OnInit {
  selectedlap;
  laps=[
    {
      imgUrl:'https://cdn.pixabay.com/photo/2016/09/24/22/26/ring-1692713__480.jpg',
      name:'Lord of the ring',
      about:'IMDB:8.8/10  ,  Metacritic :92% ,Rotten tomatos:91%'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2015/09/09/20/18/harry-potter-933064__480.jpg',
      name:'Harry Potter',
      about:'IMDB:7.6/10  ,  Metacritic :64% ,Rotten tomatos:81%'
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842_1280.jpg',
      name:'Captain America',
      about:'IMDB:6.9/10  ,  Metacritic :66% ,Rotten tomatos:81%'
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
