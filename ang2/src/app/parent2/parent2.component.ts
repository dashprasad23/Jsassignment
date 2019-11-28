import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {
  selectedlap;
  laps=[
    {
      imgUrl:'https://cdn.pixabay.com/photo/2018/03/01/09/33/laptop-3190194__480.jpg',
      name:'Meet Surface Book 2',
      about:''
    },
    {
      imgUrl:'https://image.shutterstock.com/image-photo/successful-female-grapic-designer-watching-260nw-1033103851.jpg',
      name:'Lenovo ideapad-550',
      about:''
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2018/02/16/10/52/beverage-3157395__480.jpg',
      name:'',
      about:''
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
