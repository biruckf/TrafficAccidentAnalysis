import {Component, OnInit} from "@angular/core";
import "rxjs/add/operator/startWith";
import "rxjs/add/operator/map";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./timeline.component.html",
    styleUrls: ["./timeline.component.scss"]
})
export class TimelineComponent implements OnInit {
    //Header Title
    title: string = "Timeline";

    //Date Picker
    constructor() {

    }

    ngOnInit() {
    }
}
