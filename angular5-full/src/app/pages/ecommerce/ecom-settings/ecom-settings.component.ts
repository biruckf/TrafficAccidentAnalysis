import {Component} from "@angular/core";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./ecom-settings.component.html",
    styleUrls: ["./ecom-settings.component.scss"]
})
export class EcomSettingsComponent {
    //SELECTS
    expressCheckoutRequired = false;
    customCheckoutRequired = false;
    showSelect = false;
    floatPlaceholder: string = "auto";

    expressCheckout = [
        {value: "express-0", viewValue: "PayPal Express Checkout"},
        {value: "express-1", viewValue: "PayPal Payments Pro (US)"},
        {value: "express-2", viewValue: "PayPal Website Payments Pro (CA)"},
        {value: "express-3", viewValue: "PayPal Website Payments Pro (UK)"}
    ];
    customCheckout = [
        {value: "express-0", viewValue: "PayPal Express Checkout"},
        {value: "express-1", viewValue: "PayPal Payments Pro (US)"},
        {value: "express-2", viewValue: "PayPal Website Payments Pro (CA)"},
        {value: "express-3", viewValue: "PayPal Website Payments Pro (UK)"}
    ];
}
