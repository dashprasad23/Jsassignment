import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  
  selectedJet;
  Jets= [
    {
      imgUrl:'https://cdn.pixabay.com/photo/2017/01/17/10/39/av-8b-harrier-1986422_1280.jpg',
      name:'SEA Herriar',
      about:""
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2017/04/19/17/30/f-15-2243038__480.jpg',
      name:'F-15 Strike eagle',
      about:""
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2018/03/23/20/18/aircraft-3254820__480.png',
      name:'F-35',
      about:""
    },
    {
      imgUrl:'https://cdn.pixabay.com/photo/2014/12/29/15/10/military-raptor-582890__480.jpg',
      name:'F-22 raptor',
      about:""
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendJet(jet)
  {
    console.log(jet);
    this.selectedJet=jet;
  }

}
