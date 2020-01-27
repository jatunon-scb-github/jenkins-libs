def updateEnvTable(environ) {
build job: 'connect_release-dashboard-update', parameters: [
string(name: 'app_name', value: ${app_name),
string(name: 'latesttag', value: ${latesttag}),
string(name: 'BUILD_NUMBER', value: ${BUILD_NUMBER}),
string(name: 'GIT_COMMIT', value: ${lGIT_COMMIT}),
string(name: 'GIT_BRANCH', value: ${GIT_BRANCH})],wait: false
}
