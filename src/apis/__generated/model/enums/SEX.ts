export const SEX_CONSTANTS = [
    'FEMALE', 
    'MALE'
] as const;
export type SEX = typeof SEX_CONSTANTS[number];
