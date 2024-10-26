import type {Executor} from '../';
import type {UserDto} from '../model/dto/';
import type {
    Page, 
    QueryRequest, 
    SaTokenInfo, 
    UserInput, 
    UserLoginInput, 
    UserSpec
} from '../model/static/';

export class UserForFrontController {
    
    constructor(private executor: Executor) {}
    
    delete: (options: UserForFrontControllerOptions['delete']) => Promise<
        boolean | undefined
    > = async(options) => {
        let _uri = '/front/user/delete';
        return (await this.executor({uri: _uri, method: 'POST', body: options.body})) as Promise<boolean | undefined>;
    }
    
    findById: (options: UserForFrontControllerOptions['findById']) => Promise<
        UserDto['UserRepository/USER_ROLE_FETCHER']
    > = async(options) => {
        let _uri = '/front/user/';
        _uri += encodeURIComponent(options.id);
        return (await this.executor({uri: _uri, method: 'GET'})) as Promise<UserDto['UserRepository/USER_ROLE_FETCHER']>;
    }
    
    login: (options: UserForFrontControllerOptions['login']) => Promise<
        SaTokenInfo
    > = async(options) => {
        let _uri = '/front/user/login';
        return (await this.executor({uri: _uri, method: 'POST', body: options.body})) as Promise<SaTokenInfo>;
    }
    
    query: (options: UserForFrontControllerOptions['query']) => Promise<
        Page<UserDto['UserRepository/COMPLEX_FETCHER']>
    > = async(options) => {
        let _uri = '/front/user/query';
        return (await this.executor({uri: _uri, method: 'POST', body: options.body})) as Promise<Page<UserDto['UserRepository/COMPLEX_FETCHER']>>;
    }
    
    save: (options: UserForFrontControllerOptions['save']) => Promise<
        string
    > = async(options) => {
        let _uri = '/front/user/save';
        return (await this.executor({uri: _uri, method: 'POST', body: options.body})) as Promise<string>;
    }
}

export type UserForFrontControllerOptions = {
    'findById': {
        id: string
    }, 
    'query': {
        body: QueryRequest<UserSpec>
    }, 
    'save': {
        body: UserInput
    }, 
    'delete': {
        body: Array<string>
    }, 
    'login': {
        body: UserLoginInput
    }
}
