import {Component, ElementRef, HostListener, OnInit, ViewChild, ViewEncapsulation} from "@angular/core";
import {GlobalState} from "../../../app.state";
import {ConfigService} from "../../../shared/services/config/config.service";
import {MatDrawer} from "@angular/material";
import {TabsetComponent} from "ngx-bootstrap";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./left-side-nav-v1.component.html",
    styleUrls: ["./left-side-nav-v1.component.scss"],
    encapsulation: ViewEncapsulation.Emulated
})
export class LeftSideNavV1Component implements OnInit {
    @ViewChild("staticTabs") staticTabs: TabsetComponent;
    @ViewChild("leftSidenav1") leftSidenav1: MatDrawer;
    @ViewChild("menuTabs") private allMElementRef;
    navMode = "side";
    tabLabels = [
        {label: "Sidenav item 1", active: true},
        {label: "Sidenav item 2", active: false},
        {label: "Sidenav item 3", active: false}
    ];

    selectTab(tab: any, tab_id: number) {
        this.tabLabels.forEach(tab => tab.active = false);
        this.tabLabels.find(t => t === tab).active = true;
        this.staticTabs.tabs[tab_id].active = true;
    }

    constructor(public config: ConfigService,
                private _elementRef: ElementRef,
                private _state: GlobalState) {
    }

    ngOnInit() {
        if (window.innerWidth < this.config.breakpoint.desktop) {
            this.navMode = "over";
            this.leftSidenav1.opened = false;
        }
        if (window.innerWidth > this.config.breakpoint.desktop) {
            this.navMode = "side";
            this.leftSidenav1.open();
        }
    }

    @HostListener("window:resize", ["$event"])
    onResize(event) {
        if (event.target.innerWidth < this.config.breakpoint.desktop) {
            this.navMode = "over";
            this.leftSidenav1.close();
        }
        if (event.target.innerWidth > this.config.breakpoint.desktop) {
            this.navMode = "side";
            this.leftSidenav1.open();
        }
    }
}
