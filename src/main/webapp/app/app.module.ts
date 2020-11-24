import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { GatewayrequisionSharedModule } from 'app/shared/shared.module';
import { GatewayrequisionCoreModule } from 'app/core/core.module';
import { GatewayrequisionAppRoutingModule } from './app-routing.module';
import { GatewayrequisionHomeModule } from './home/home.module';
import { GatewayrequisionEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    GatewayrequisionSharedModule,
    GatewayrequisionCoreModule,
    GatewayrequisionHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    GatewayrequisionEntityModule,
    GatewayrequisionAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class GatewayrequisionAppModule {}
