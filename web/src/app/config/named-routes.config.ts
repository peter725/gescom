import { NgModule } from '@angular/core';
import { NamedRoutesModule, NamedRouteSource } from '@libs/named-routes';

const routes: NamedRouteSource[] = [
  { key: 'home', value: '/app/inicio' },
  { key: 'login', value: '/auth/login' },
  { key: 'logout', value: '/auth/logout' },

  { key: 'userManagementCreate', value: '/app/usuarios/0' },
  { key: 'userManagementList', value: '/app/usuarios/consulta' },
  { key: 'userManagementEdit', value: '/app/usuarios/:id' },

  { key: 'campaignManagementCreate', value: '/app/campanas/0' },
  { key: 'campaignManagementList', value: '/app/campanas/consulta' },

  { key: 'approachManagementCreate', value: '/app/propuestas/0' },
  { key: 'approachManagementList', value: '/app/propuestas/consulta' },
  { key: 'approachManagementSee', value: '/app/propuestas/:id' },
];

@NgModule({
  imports: [NamedRoutesModule.forRoot(routes)],
  exports: [NamedRoutesModule],
})
export class NamedRoutesConfig {
}
