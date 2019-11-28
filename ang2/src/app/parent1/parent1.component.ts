import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})
export class Parent1Component implements OnInit {
  selectedhels;
  hels=[
    {
      imgUrl:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201905/APache.jpeg?2VrOMFLm952ODoMGEhXnx92o9alIcqY0',
      name:'Ah-64 appache',
      about:'national orign:USA  Industry:BOEING  Speed:560KMPH'
    },
    {
      imgUrl:'https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/CH-47_Chinook_helicopter_flyby.jpg/1920px-CH-47_Chinook_helicopter_flyby.jpg',
      name:'CHINOOK',
      about:'National Orign:USA, Role:Cargo transport,Speed:350kmph'
    },
    {
      imgUrl:'https://upload.wikimedia.org/wikipedia/commons/8/8b/Bell_USMC_AH-1_Viper_%28cropped%29.jpg',
      name:'BELL AHZ viper',
      about:'National Orign:USA, Role:Attack,Speed:750kmph'
    },
    {
      imgUrl:'https://upload.wikimedia.org/wikipedia/commons/0/0c/Russian_Air_Force_Kamov_Ka-50.jpg',
      name:'Kamove ka-52 Alligator',
      about:'National Orign:USSR, Role:Attack,Speed:550kmph'
    },
  ]

  constructor() { }

  ngOnInit() {
  }
  sendhels(hel)
  {
    console.log(hel);
    this.selectedhels=hel;
  }

}
