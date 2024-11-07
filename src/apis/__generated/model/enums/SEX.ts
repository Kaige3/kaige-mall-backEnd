export const SEX_CONSTANTS = [
    'FEMALE', 
    'MALE', 
    'PRIVATE'
] as const;
export type SEX = typeof SEX_CONSTANTS[number];
