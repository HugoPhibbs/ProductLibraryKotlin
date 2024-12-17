package org.example

import org.bimserver.client.json.JsonBimServerClientFactory
import org.bimserver.shared.UsernamePasswordAuthenticationInfo

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val JsonBimServerClientFactory = JsonBimServerClientFactory("http://localhost:8080");
    val client = JsonBimServerClientFactory.create(UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin"))
    client.getServiceInterface().addProject("test", "ifc2x3tc1");
}