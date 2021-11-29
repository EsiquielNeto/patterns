package br.com.studies.patterns.behavioral.strategy;

public enum FreightType {
    PAC {
        @Override
        public Freight getFreight() {
            return new PacFreight();
        }
    },
    SEDEX {
        @Override
        public Freight getFreight() {
            return new SedexFreight();
        }
    },
    PREMIUM {
        @Override
        public Freight getFreight() {
            return new PremiumFreight();
        }
    };

    public abstract Freight getFreight();
}
