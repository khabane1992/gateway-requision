import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'region',
        loadChildren: () => import('./region/region.module').then(m => m.GatewayrequisionRegionModule),
      },
      {
        path: 'country',
        loadChildren: () => import('./country/country.module').then(m => m.GatewayrequisionCountryModule),
      },
      {
        path: 'location',
        loadChildren: () => import('./location/location.module').then(m => m.GatewayrequisionLocationModule),
      },
      {
        path: 'department',
        loadChildren: () => import('./department/department.module').then(m => m.GatewayrequisionDepartmentModule),
      },
      {
        path: 'task',
        loadChildren: () => import('./task/task.module').then(m => m.GatewayrequisionTaskModule),
      },
      {
        path: 'employee',
        loadChildren: () => import('./employee/employee.module').then(m => m.GatewayrequisionEmployeeModule),
      },
      {
        path: 'job',
        loadChildren: () => import('./job/job.module').then(m => m.GatewayrequisionJobModule),
      },
      {
        path: 'job-history',
        loadChildren: () => import('./job-history/job-history.module').then(m => m.GatewayrequisionJobHistoryModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class GatewayrequisionEntityModule {}
