package com.github.herong.thrift.comm.complier;

public class GenRemoteService2 implements IRemoteService {

	@Override
	public String execute(String msg) {
		System.out.println("���ɵ�����:" + getClass().getName());
		System.out.println("���÷���:execute:" + msg);
		return "resp" + msg;
	}

}
