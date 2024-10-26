/**
 * Entity for table "role"
 */
export interface RoleInput {
    name: string;
    id?: string | undefined;
    menuIds: Array<string>;
}
