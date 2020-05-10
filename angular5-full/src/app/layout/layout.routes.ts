import { Routes, RouterModule } from "@angular/router";
import { LayoutComponent } from "./layout.component";
import { AdminComponent } from "app/pages/forms/admin/admin.component";
const LAYOUT_ROUTES: Routes = [
	{
		path: "authentication/lock",
		loadChildren: "../pages/authentication/lock/lock.module#LockModule"
	},
	{
		path: "authentication/login",
		loadChildren: "../pages/authentication/login/login.module#LoginModule"
	},
	{
		path: "",
		component: LayoutComponent,
		children: [
			{ path: "", redirectTo: "dashboards", pathMatch: "full" },
			//---------------------------------------------------------->
			//Dashboards
			//---------------------------------------------------------->
			{
				path: "dashboards",
				loadChildren: "../pages/dashboards/dashboards.module#DashboardsModule"
			},
			//---------------------------------------------------------->
			//Page Layouts
			//---------------------------------------------------------->
			{
				path: "page-layouts/full-width-v1",
				loadChildren:
					"../pages/page-layouts/full-width-v1/full-width-v1.module#FullWidthV1Module"
			},
			{
				path: "page-layouts/full-width-v2",
				loadChildren:
					"../pages/page-layouts/full-width-v2/full-width-v2.module#FullWidthV2Module"
			},
			{
				path: "page-layouts/full-width-v3",
				loadChildren:
					"../pages/page-layouts/full-width-v3/full-width-v3.module#FullWidthV3Module"
			},
			{
				path: "page-layouts/boxed-layout-v1",
				loadChildren:
					"../pages/page-layouts/boxed-layout-v1/boxed-layout-v1.module#BoxedV1Module"
			},
			{
				path: "page-layouts/boxed-layout-v2",
				loadChildren:
					"../pages/page-layouts/boxed-layout-v2/boxed-layout-v2.module#BoxedV2Module"
			},
			{
				path: "page-layouts/boxed-layout-v3",
				loadChildren:
					"../pages/page-layouts/boxed-layout-v3/boxed-layout-v3.module#BoxedV3Module"
			},
			{
				path: "page-layouts/detached-toolbar-left",
				loadChildren:
					"../pages/page-layouts/detached-toolbar-left/detached-toolbar-left.module#DetachedToolbarLeftModule"
			},
			{
				path: "page-layouts/detached-toolbar-right",
				loadChildren:
					"../pages/page-layouts/detached-toolbar-right/detached-toolbar-right.module#DetachedToolbarRightModule"
			},
			{
				path: "page-layouts/left-side-nav-v1",
				loadChildren:
					"../pages/page-layouts/left-side-nav-v1/left-side-nav-v1.module#LeftSideNavV1Module"
			},
			{
				path: "page-layouts/left-side-nav-v2",
				loadChildren:
					"../pages/page-layouts/left-side-nav-v2/left-side-nav-v2.module#LeftSideNavV2Module"
			},
			{
				path: "page-layouts/right-side-nav-v1",
				loadChildren:
					"../pages/page-layouts/right-side-nav-v1/right-side-nav-v1.module#RightSideNavV1Module"
			},
			{
				path: "page-layouts/right-side-nav-v2",
				loadChildren:
					"../pages/page-layouts/right-side-nav-v2/right-side-nav-v2.module#RightSideNavV2Module"
			},
			//---------------------------------------------------------->
			//Cards
			//---------------------------------------------------------->
			{
				path: "cards/card-templates",
				loadChildren:
					"../pages/cards/card-templates/card-templates.module#CardTemplatesModule"
			},
			{
				path: "cards/card-demos",
				loadChildren:
					"../pages/cards/card-demos/card-demos.module#CardDemosModule"
			},

			//---------------------------------------------------------->
			//Charts
			//---------------------------------------------------------->
			{
				path: "charts/ngx-charts",
				loadChildren:
					"../pages/charts/ngx-charts/ngx-charts.module#NgxChartsModule"
			},
			{
				path: "charts/ng2-charts",
				loadChildren:
					"../pages/charts/ng2-charts/ng2-charts.module#Ng2ChartsModule"
			},
			//---------------------------------------------------------->
			//E-Commerce
			//---------------------------------------------------------->
			{
				path: "ecommerce/ecom-dashboard",
				loadChildren:
					"../pages/ecommerce/ecom-dashboard/ecom-dashboard.module#EcomDashboardModule"
			},
			{
				path: "ecommerce/ecom-customers",
				loadChildren:
					"../pages/ecommerce/ecom-customers/ecom-customers.module#EcomCustomersModule"
			},
			{
				path: "ecommerce/ecom-products",
				loadChildren:
					"../pages/ecommerce/ecom-products/ecom-products.module#EcomProductsModule"
			},
			{
				path: "ecommerce/ecom-settings",
				loadChildren:
					"../pages/ecommerce/ecom-settings/ecom-settings.module#EcomSettingsModule"
			},
			//---------------------------------------------------------->
			//File Manager
			//---------------------------------------------------------->
			{
				path: "file-manager",
				loadChildren:
					"../pages/file-manager/file-manager.module#FileManagerModule"
			},
			//---------------------------------------------------------->
			//Taskboard
			//---------------------------------------------------------->
			{
				path: "taskboard",
				loadChildren: "../pages/taskboard/taskboard.module#TaskboardModule"
			},
			// {
			// 	path: "accident",
			// 	loadChildren: "../pages/accident-form/accident-form.module#ACCIDENTFORMMODULE"
			// },
			//---------------------------------------------------------->
			//acc
			//---------------------------------------------------------->
			
			//---------------------------------------------------------->
			//Mail
			//---------------------------------------------------------->
			{ path: "mail", loadChildren: "../pages/mail/mail.module#MailModule" },
			//---------------------------------------------------------->
			//Profile
			//---------------------------------------------------------->
			{
				path: "profile",
				loadChildren: "../pages/profile/profile.module#ProfileModule"
			},
			//---------------------------------------------------------->
			//Invoice
			//---------------------------------------------------------->
			{
				path: "invoice",
				loadChildren: "../pages/invoice/invoice.module#InvoiceModule"
			},
			//---------------------------------------------------------->
			//Admin
			//---------------------------------------------------------->
			{
				path: "accident",
				loadChildren: "../pages/accident-form/accident-form.module#ACCIDENTFORMMODULE"
			},
			//---------------------------------------------------------->
			//Timeline
			//---------------------------------------------------------->
			{
				path: "timeline",
				loadChildren: "../pages/timeline/timeline.module#TimelineModule"
			},
			//---------------------------------------------------------->
			//Locations
			//---------------------------------------------------------->
			{
				path: "locations",
				loadChildren: "../pages/locations/locations.module#LocationsModule"
			},
			//---------------------------------------------------------->
			//Pricing Tables
			//---------------------------------------------------------->
			{
				path: "pricing-tables",
				loadChildren:
					"../pages/pricing-tables/pricing-tables.module#PricingTablesModule"
			},
			//---------------------------------------------------------->
			//User Interface
			//---------------------------------------------------------->
			{
				path: "user-interface/alerts",
				loadChildren:
					"../pages/user-interface/alerts/alerts.module#AlertsModule"
			},
			{
				path: "user-interface/badges-labels",
				loadChildren:
					"../pages/user-interface/badges-labels/badges-labels.module#BadgesLabelsModule"
			},
			{
				path: "user-interface/buttons",
				loadChildren:
					"../pages/user-interface/buttons/buttons.module#ButtonsModule"
			},
			{
				path: "user-interface/colors",
				loadChildren:
					"../pages/user-interface/colors/colors.module#ColorsModule"
			},
			{
				path: "user-interface/grid",
				loadChildren: "../pages/user-interface/grid/grid.module#GridModule"
			},
			{
				path: "user-interface/icons",
				loadChildren: "../pages/user-interface/icons/icons.module#IconsModule"
			},
			{
				path: "user-interface/list",
				loadChildren: "../pages/user-interface/list/list.module#ListModule"
			},
			{
				path: "user-interface/preloaders",
				loadChildren:
					"../pages/user-interface/preloaders/preloaders.module#PreloadersModule"
			},
			{
				path: "user-interface/typography",
				loadChildren:
					"../pages/user-interface/typography/typography.module#TypographyModule"
			},
			//---------------------------------------------------------->
			//Components
			//---------------------------------------------------------->
			{
				path: "components/collapsible",
				loadChildren:
					"../pages/components/collapsible/collapsible.module#CollapsibleModule"
			},
			{
				path: "components/drawers",
				loadChildren: "../pages/components/drawers/drawers.module#DrawersModule"
			},
			{
				path: "components/dropdowns",
				loadChildren:
					"../pages/components/dropdowns/dropdowns.module#DropdownsModule"
			},
			{
				path: "components/modals",
				loadChildren: "../pages/components/modals/modals.module#ModalsModule"
			},
			{
				path: "components/notifications-dialogs",
				loadChildren:
					"../pages/components/notifications-dialogs/notifications-dialogs.module#NotificationsDialogsModule"
			},
			{
				path: "components/scrollable",
				loadChildren:
					"../pages/components/scrollable/scrollable.module#ScrollableModule"
			},
			{
				path: "components/sliders-progressbars",
				loadChildren:
					"../pages/components/sliders-progressbars/sliders-progressbars.module#SlidersProgressbarsModule"
			},
			{
				path: "components/tabs-pills",
				loadChildren:
					"../pages/components/tabs-pills/tabs-pills.module#TabsPillsModule"
			},
			{
				path: "components/toolbars",
				loadChildren:
					"../pages/components/toolbars/toolbars.module#ToolbarsModule"
			},
			{
				path: "components/tooltips-popovers",
				loadChildren:
					"../pages/components/tooltips-popovers/tooltips-popovers.module#TooltipsPopoversModule"
			},
			//---------------------------------------------------------->
			//Forms
			//---------------------------------------------------------->
			{
				path: "forms/form-components",
				loadChildren:
					"../pages/forms/form-components/form-comp.module#FormCompModule"
			},
			{
				path: "forms/admin-components",
				loadChildren:
					"../pages/forms/admin/admin.module#AdminModule"
					
			},
			{
				path: "forms/form-elements",
				loadChildren:
					"../pages/forms/form-elements/form-elements.module#FormElementsModule"
			},
			{
				path: "forms/form-layouts",
				loadChildren:
					"../pages/forms/form-layouts/form-layouts.module#FormLayoutsModule"
			},
			{
				path: "forms/form-validation",
				loadChildren:
					"../pages/forms/form-validation/form-validation.module#FormValidationModule"
			},
			{
				path: "forms/form-stepper",
				loadChildren:
					"../pages/forms/form-stepper/form-stepper.module#StepperModule"
			},
			//
			//---------------------------------------------------------->
			//Tables
			//---------------------------------------------------------->
			{
				path: "tables/basic-tables",
				loadChildren:
					"../pages/tables/basic-tables/basic-tables.module#BasicTablesModule"
			},
			{
				path: "tables/data-tables",
				loadChildren:
					"../pages/tables/data-tables/data-tables.module#DataTablesModule"
			},
			//
			//---------------------------------------------------------->
			//Helper Classes
			//---------------------------------------------------------->
			{
				path: "helper-classes",
				loadChildren:
					"../pages/helper-classes/helper-classes.module#HelperClassesModule"
			}
		]
	},

	// 404 Page Not Found
	{ path: "**", redirectTo: "dashboards" }
];

export const LayoutRoutes = RouterModule.forChild(LAYOUT_ROUTES);
