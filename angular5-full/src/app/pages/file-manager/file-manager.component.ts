import {Component, ElementRef, HostListener, OnInit, ViewChild} from "@angular/core";
import {GlobalState} from "../../app.state";
import {ConfigService} from "../../shared/services/config/config.service";
import {MatDrawer} from "@angular/material";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./file-manager.component.html",
    styleUrls: ["./file-manager.component.scss"]
})
export class FileManagerComponent implements OnInit {
    @ViewChild("rightSidenav2") rightSidenav2: MatDrawer;
    navModeRight = "side";
    @ViewChild("leftSidenav2") leftSidenav2: MatDrawer;
    navModeLeft = "side";
    fixed: boolean = false;
    open: boolean = false;
    spin: boolean = false;
    direction: string = "down";
    animationMode: string = "scale";

    constructor(public config: ConfigService,
                private _elementRef: ElementRef,
                private _state: GlobalState) {
    }

    ngOnInit() {
        if (window.innerWidth < this.config.breakpoint.desktop) {
            this.navModeLeft = "over";
            this.leftSidenav2.opened = false;
        }
        if (window.innerWidth > this.config.breakpoint.desktop) {
            this.navModeLeft = "over";
            this.leftSidenav2.close();
        }
        if (window.innerWidth < this.config.breakpoint.desktop) {
            this.navModeRight = "over";
            this.rightSidenav2.opened = false;
        }
        if (window.innerWidth > this.config.breakpoint.desktop) {
            this.navModeRight = "side";
            this.rightSidenav2.open();
        }
    }

    _click(event: any) {
        //console.log(event);
    }

    @HostListener("window:resize", ["$event"])
    onResize(event) {
        if (event.target.innerWidth < this.config.breakpoint.desktop) {
            this.navModeLeft = "over";
            this.leftSidenav2.close();
        }
        if (event.target.innerWidth > this.config.breakpoint.desktop) {
            this.navModeLeft = "over";
            this.leftSidenav2.close();
        }
        if (event.target.innerWidth < this.config.breakpoint.desktop) {
            this.navModeRight = "over";
            this.rightSidenav2.close();
        }
        if (event.target.innerWidth > this.config.breakpoint.desktop) {
            this.navModeRight = "side";
            this.rightSidenav2.open();
        }
    }
}
