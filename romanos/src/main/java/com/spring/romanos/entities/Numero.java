package com.spring.romanos.entities;

public class Numero {
    private final Integer valor;

    public Numero(Integer valor) {
        this.valor = valor;
    }

    public String toRomano() {
        String[] romans = new String[] { "I", "V", "X", "L", "C", "D", "M" };
        String romano = String.valueOf(this.valor);
        StringBuilder roman = new StringBuilder();
        int s = 4;
        for (int i = 6; i >= 0; i -= 2)
        {
            if (romano.length() == s)
            {
                char value = romano.charAt(0);
                switch (value)
                {
                    case '1': { roman.append(romans[i]); } break;
                    case '2': { roman.append(romans[i]).append(romans[i]); } break;
                    case '3': { roman.append(romans[i]).append(romans[i]).append(romans[i]); } break;
                    case '4': { roman.append(romans[i]).append(romans[i + 1]); } break;
                    case '5': { roman.append(romans[i + 1]); } break;
                    case '6': { roman.append(romans[i + 1]).append(romans[i]); } break;
                    case '7': { roman.append(romans[i + 1]).append(romans[i]).append(romans[i]); } break;
                    case '8': { roman.append(romans[i + 1]).append(romans[i]).append(romans[i]).append(romans[i]); } break;
                    case '9': { roman.append(romans[i]).append(romans[i + 2]); } break;
                    default: { roman.append(""); } break;
                }

                romano = romano.substring(1);
            }
            s--;
        }
        return roman.toString();
    }
}
