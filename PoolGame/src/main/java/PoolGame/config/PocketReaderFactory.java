package PoolGame.config;

public class PocketReaderFactory implements ReaderFactory{
    public Reader buildReader(){
        return new PocketReader();
    }
}
