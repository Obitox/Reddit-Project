import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'rd-popular',
  templateUrl: './popular.component.html',
  styleUrls: ['./popular.component.css']
})
export class PopularComponent implements OnInit {

  outputPath: string = 'https://angular-ui.github.io/bootstrap/';

  constructor() { }

  ngOnInit() {
  }

}
