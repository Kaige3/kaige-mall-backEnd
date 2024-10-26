import type {Executor} from './';
import {
    DictController, 
    MenuController, 
    RoleController, 
    UserForFrontController
} from './services/';

export class Api {
    
    readonly dictController: DictController
    
    readonly menuController: MenuController
    
    readonly roleController: RoleController
    
    readonly userForFrontController: UserForFrontController
    
    constructor(executor: Executor) {
        this.dictController = new DictController(executor);
        this.menuController = new MenuController(executor);
        this.roleController = new RoleController(executor);
        this.userForFrontController = new UserForFrontController(executor);
    }
}