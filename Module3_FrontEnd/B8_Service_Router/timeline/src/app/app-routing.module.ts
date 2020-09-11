import {PreloadAllModules, RouterModule, Routes} from "@angular/router";
import {TimelinesComponent} from "./timelines/timelines.component";
import {NgModule} from "@angular/core";

const routes: Routes = [
  {
    path: '',
    component: TimelinesComponent
  }
];

@NgModule(
  {
    imports: [RouterModule.forRoot(routes, {
      preloadingStrategy: PreloadAllModules
    })],
    exports: [RouterModule]
  }
)

export class AppRoutingModule {

}
